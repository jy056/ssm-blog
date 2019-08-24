package com.yc.web;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.yc.bean.Article;
import com.yc.bean.Category;
import com.yc.bean.User;
import com.yc.biz.ArticleBiz;
import com.yc.biz.CategoryBiz;

@Controller
public class ArticleAction {
	@Resource
	private ArticleBiz abiz;
	@Resource
	private CategoryBiz cbiz;

	// header里的分类。执行所有代码前执行，并且将返回值放入Model
	@ModelAttribute("cList")
	public List<Category> init() {
		return cbiz.queryAll();
	}

	// 查询首页
	@GetMapping("index")
	public String index(@RequestParam(defaultValue = "1") int page, Model model) {
		// 最新文章
		model.addAttribute("aList", abiz.queryNewArticle(page));
		return "index";
	}

	// 分类文章
	@GetMapping("category")
	public String category(@RequestParam(defaultValue = "1") int page, int id, Model model) {
		System.out.println("category======id:" + id);
		model.addAttribute("aList", abiz.queryByCategory(id, page));
		return "category";
	}

	// 显示文章
	@GetMapping("article")
	public String article(@RequestParam(defaultValue = "1") int page,int id, Model model) {
		Article a = abiz.read(id);
		//调用获取评论的方法，触发分页查询
		PageHelper.startPage(page, 5);
		a.getComments();
		//查相关文章
		List<Article> relaList=abiz.queryRela(a.getCategoryid());
		model.addAttribute("relaList", relaList);
		// 不设定属性名称，则默认为小写开头的类名
		model.addAttribute(a);
		return "article";
	}
	
	@GetMapping("toedit")	
	public String toEdit(Model model){
		model.addAttribute("article", new Article());
		return "articleEdit";
	}
	@PostMapping("saveArticle")
	public String save(Article article,Model model,@SessionAttribute("loginedUser")User user){
		article.setAuthor(user.getName());
		article.setCreatetime(new Date());
		abiz.save(article);
		return article(1,article.getId(),model);
	}
	
	/**
	 * ckeditor（4.8版本）的文件上传接口要求返回一段js代码
	 * MultipartFile  springmvc用户接收文件的对象 
	 * CKEditorFuncNum  回调代码编号
	 * @throws IOException 
	 * @throws IllegalStateException 
	 */
	@PostMapping("upload")
	@ResponseBody
	public String upload(@RequestParam("upload")MultipartFile file,String CKEditorFuncNum) throws IllegalStateException, IOException{
		String fname=file.getOriginalFilename();//原文件名
		File dest=new File("d:/blog/upload/"+fname);
		file.transferTo(dest);//保存到
		//拼接回调js代码
		// 返回"图像"选项卡并显示图片 
        String js="<script type=\"text/javascript\">";
        js+="window.parent.CKEDITOR.tools.callFunction(" + CKEditorFuncNum
               + ",'upload/"+fname+"','')";
        js+="</script>";
        System.out.println("================"+js);
		return js;
	}
}
