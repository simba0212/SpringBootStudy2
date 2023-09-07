package com.ict.edu2.mapper.members;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ict.edu2.model.members.MemberVO;

@Mapper
public interface Member_Mapper {
  // 해당 내용이 resources/mapper/member.xml 을 반영하고 전달하는 역할을 한다.
  // Spring MVC 패턴에서의 DAO역할
  // 그런데 interface를 구체화 하지 않는데 Mapper와 어떻게 Mapping이 되냐?
  // **메서드의 이름이 Mapper에서의 id로 자동으로 설정되고 Mapping이 되는것!!**
  public List<MemberVO> getList();
  public int getIDCnt(String id);
  public MemberVO getMemberOne(String id);
  int getMemberAdd(MemberVO vo);

}
