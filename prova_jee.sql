-- phpMyAdmin SQL Dump
-- version 4.0.4
-- http://www.phpmyadmin.net
--
-- Máquina: localhost
-- Data de Criação: 10-Set-2018 às 11:22
-- Versão do servidor: 5.6.12-log
-- versão do PHP: 5.4.16

--
-- Base de Dados: `prova_jee`
--
CREATE DATABASE IF NOT EXISTS `prova_jee` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `prova_jee`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `custo_transporte`
--

CREATE TABLE IF NOT EXISTS `custo_transporte` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `distancia_rod_pav` int(11) DEFAULT NULL,
  `distancia_rod_nao_pav` int(11) DEFAULT NULL,
  `veiculo` int(11) NOT NULL,
  `carga` int(11) NOT NULL,
  `custo` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `veiculo`
--

CREATE TABLE IF NOT EXISTS `veiculo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `custo` decimal(10,2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;
