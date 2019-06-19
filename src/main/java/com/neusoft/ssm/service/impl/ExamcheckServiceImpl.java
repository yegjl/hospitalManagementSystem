package com.neusoft.ssm.service.impl;

import com.neusoft.ssm.bean.*;
import com.neusoft.ssm.dao.ExamcheckoneMapper;
import com.neusoft.ssm.service.ExamcheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamcheckServiceImpl implements ExamcheckService {

    @Autowired
    ExamcheckoneMapper examcheckoneMapper;

    @Override
    public List<Examcheckone> getPro(Integer doctorid, Integer medicalid) {
        return examcheckoneMapper.getPro(doctorid,medicalid);
    }

    @Override
    public int deleteByExamId(Integer i, Integer id) {
        return examcheckoneMapper.deleteByExamId(i,id);
    }

    @Override
    public void deleteUnsave() {
        examcheckoneMapper.deleteUnsave();
    }

    @Override
    public Integer findIdByCode(String i) {
        return examcheckoneMapper.findIdByCode(i);
    }

    @Override
    public Integer saveByExamId(Integer i, Integer id) {
        return examcheckoneMapper.saveByExamId(i,id);
    }

    @Override
    public Integer openByExamId(Integer i, Integer id) {
        return examcheckoneMapper.openByExamId(i,id);
    }

    @Override
    public Integer cancelByExamId(Integer i, Integer id) {
        return examcheckoneMapper.cancelByExamId(i,id);
    }

    @Override
    public List<Fmeditem> findByExamType(String id) {
        return examcheckoneMapper.findByExamType(id);
    }

    @Override
    public Fmeditem findProByName(String name, String id) {
        return examcheckoneMapper.findProByName(name,id);
    }

    @Override
    public int addInfo(ExamcheckInfo examcheckInfo) {
        return examcheckoneMapper.addInfo(examcheckInfo);
    }

    @Override
    public int getCount(Integer doctorid, Integer medicalid) {
        return examcheckoneMapper.getCount(doctorid,medicalid);
    }

    @Override
    public int addExam(Examcheck examcheck) {
        return examcheckoneMapper.addExam(examcheck);
    }

    @Override
    public Integer getExamId(Integer doctorid, Integer medicalid) {
        return examcheckoneMapper.getExamId(doctorid,medicalid);
    }

    @Override
    public int addMuban(ExamcheckSet examcheckSet) {
        return examcheckoneMapper.addMuban(examcheckSet);
    }

    @Override
    public int addMubanInfo(ExamcheckSetInfo examcheckSetInfo) {
        return examcheckoneMapper.addMubanInfo(examcheckSetInfo);
    }

}
