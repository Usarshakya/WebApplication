/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.git.webapp.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.git.webapp.dao.MemberDAO;
import org.git.webapp.entity.Member;

/**
 *
 * @author Rasna
 */
public class MemberDAOImpl implements MemberDAO {

    @Override
    public List<Member> getAll() {
        List<Member> memberList = new ArrayList<>();
        memberList.add(new Member(1, "Rasna", "Shakya", "rasnashakya@gmail.com", "9810112520"));
        memberList.add(new Member(2, "Gyani", "Shakya", "Gyanishakya@gmail.com", "9810112544"));
        return memberList;

    }

    @Override
    public Member getById(int id) {
        for (Member m : getAll()) {
            if (m.getId() == id) {
                return m;
            }
            
        }
        return null;

    }

}
