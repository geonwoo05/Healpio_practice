package com.healpio.mapper;

import java.util.List;

import com.healpio.vo.MemberVO;


public interface MemberMapper {

	public MemberVO login(MemberVO memberVO);
	
	public int signUp(MemberVO memberVO);
	
	public int idCheck(MemberVO memberVO);
	
	public int insert(MemberVO memberVo);

}
