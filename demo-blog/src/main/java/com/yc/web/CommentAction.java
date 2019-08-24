package com.yc.web;

import java.util.Date;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.yc.bean.Comment;
import com.yc.bean.User;
import com.yc.biz.CommentBiz;
import com.yc.dao.CommentMapper;
import com.yc.vo.Result;

@RestController
public class CommentAction {

	@Resource
	private CommentMapper cm;
	@Resource
	private CommentBiz cbiz;
	
	@PostMapping("comment")
	public Result comment(@Valid Comment comm,Errors errors,@SessionAttribute(name="loginedUser",required=false) User user){
		/*if(user==null){
			return new Result(0,"请先登陆系统！");
		}*/
		
		//设置评论人id
		comm.setCreateby(user.getId());
		//设置创建时间
		comm.setCreatetime(new Date());
		
		if(errors.hasErrors()){
			return new Result(-1,"评论失败！！",errors.getAllErrors());
		}
		try {
			cbiz.comment(comm);
			return new Result(1,"评论成功！",comm);
		} catch (RuntimeException e) {
			e.printStackTrace();
			return new Result(0,"业务繁忙请稍后再试！");
		}
	}
}
