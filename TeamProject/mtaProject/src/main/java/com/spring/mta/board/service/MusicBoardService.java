package com.spring.mta.board.service;

import java.util.List;
import com.spring.mta.board.vo.MusicBoardVO;

public interface MusicBoardService {


	List<MusicBoardVO> musicBoardList(MusicBoardVO mvo);
	

}