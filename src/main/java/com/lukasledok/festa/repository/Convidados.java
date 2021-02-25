package com.lukasledok.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lukasledok.festa.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long> {

}
