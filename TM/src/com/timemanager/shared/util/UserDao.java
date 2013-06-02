package com.timemanager.shared.util;

import java.util.List;
 
import com.timemanager.shared.UserDTO;

public interface UserDao {
	public UserDTO insert(UserDTO dto);
	public int delete(long id);
	public UserDTO findById(long id);
	public UserDTO findByLogin(String userName, String password);
	public List<UserDTO> findAll();
}
