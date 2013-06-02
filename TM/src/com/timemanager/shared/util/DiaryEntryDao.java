package com.timemanager.shared.util;

import java.util.Date;
import java.util.List;

import com.timemanager.shared.DiaryEntryDTO;
import com.timemanager.shared.DiaryEntryVw;

public interface DiaryEntryDao {
	public void insert(DiaryEntryDTO dto);
	public int delete(long id);
	public DiaryEntryVw findById(long id);
	public List<DiaryEntryVw> findAll(long user_id, Date fromDate, Date toDate);
}
