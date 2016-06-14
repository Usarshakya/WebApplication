/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.git.webapp.dao;

import java.util.List;
import org.git.webapp.entity.Member;

/**
 *
 * @author Rasna
 */
public interface MemberDAO {
    
     List<Member> getAll();
     Member getById(int id);
    
}
