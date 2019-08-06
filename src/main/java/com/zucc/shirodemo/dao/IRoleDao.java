package com.zucc.shirodemo.dao;

import com.zucc.shirodemo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IRoleDao extends JpaRepository<Role,Integer> {




}
//
//   @Query(value = "SELECT a.bookpkid,a.bookcode,a.bookname,b.authorname FROM BookInfo a " +
//           "LEFT JOIN AuthorInfo b ON a.authorid=b.authorid " +
//           "WHERE a.bookpkid=:pkid", nativeQuery = true)
//   List<Object[]> selectByPkid(@Param("pkid") BigDecimal pkid);
