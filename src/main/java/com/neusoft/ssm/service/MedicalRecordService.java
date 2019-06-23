package com.neusoft.ssm.service;

import com.neusoft.ssm.bean.*;

import java.util.List;

public interface MedicalRecordService {
    MedicalRecordPage findById(Integer id);
    int deleteByPrimaryKey(Integer id);
    int insertSelective(MedicalRecordPage record);
    List<Disease> findallDisease();
    Disease findDiseaseById(Integer id);
    List<Diagnosis> findDiaAllBymedicalRecordNo(String medicalRecordNo);
    List<CommonDiagnosis> findAllCommonDiagnosis(Integer doctorid);
    Diagnosis findDiagnosisByID(Integer id);
     int insertSelectiveDia(Diagnosis record);
     int updateDia(Diagnosis record);
    int deleteDia(Integer id);
    List<MedicalRecordPageTemplate> getSet();

}
