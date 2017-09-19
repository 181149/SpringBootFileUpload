package com.springbootfileupload.api.Doa;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springbootfileupload.api.model.FileUpload;

@Repository
public class FileUploadDoa {
	@Autowired
	@PersistenceContext
    private EntityManager entityManager;
	
	public void saveFileUploadDetail(String data) {
		entityManager.getTransaction().begin();
		FileUpload fu = new FileUpload();
		fu.setData(data);
		entityManager.persist(fu);
		entityManager.getTransaction().commit();
	}

}
