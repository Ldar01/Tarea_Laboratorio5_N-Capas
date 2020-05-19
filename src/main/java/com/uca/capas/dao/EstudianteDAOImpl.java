package com.uca.capas.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.uca.capas.domain.Estudiante;

@Repository
public class EstudianteDAOImpl implements EstudianteDAO{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Estudiante> findAll() throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT * FROM public.estudiante");
		Query query = entityManager.createNativeQuery(sb.toString(), Estudiante.class);
		List<Estudiante> resultset = query.getResultList();
		
		return resultset;
	}

	@Override
	public Estudiante findOne(Integer codigo) throws DataAccessException {
		Estudiante estudiante = entityManager.find(Estudiante.class, codigo);
		
		return estudiante;
	}
	
	@Transactional
	@Override
	public void insert(Estudiante estudiante) throws DataAccessException{
		entityManager.persist(estudiante);
	}
	
}
