package com.in2it.commentandlikeservice.service;

import java.util.List;

import com.in2it.commentandlikeservice.dto.CommentDto;
import com.in2it.commentandlikeservice.dto.CommentUpdateDto;

public interface CommentService {

	public CommentDto saveComment(CommentDto commentDto, String blogid);

	public CommentDto getCommentById(String commentId);

	public List<CommentDto> getByBlogId(String blogId);

	public CommentDto updateComment(CommentUpdateDto updateDto, String commentId);

	public CommentDto deleteByCommentId(String blogId, String commentId);
	
	public boolean deleteCommentsByblogId(String blogId);

}
