package kr.co.goc.anumal.animalDAO;

import java.util.List;

import kr.co.goc.anumal.animalVO.AnimalVO;

public interface IAnimalDAO {
	
	public int insertUserInfo(AnimalVO vo);
	public int updateUserInfo(AnimalVO vo);
	public int deleteUserInfo(AnimalVO vo);
	public List<AnimalVO> searchMyInfo(AnimalVO vo);
	public List<AnimalVO> selectAllInfo();
	public int phoneNumDuplCheck(String phoneNum);
	public int nicknameDuplCheck(String nickname);
}
