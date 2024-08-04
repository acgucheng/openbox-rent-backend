-- liquibase formatted sql
-- changeset 1::create table shop
-- preConditions onFail:MARK_RAN onFailMessage:Table shop already exists
-- precondition-sql-check expectedResult:0 SELECT COUNT(*) FROM information_schema.tables WHERE table_name='shop'
CREATE TABLE `shop` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `name` varchar(255) NOT NULL,
    `address` varchar(255) NOT NULL,
    `phone` varchar(255) NOT NULL,
    `email` varchar(255) NOT NULL,
    `description` varchar(511) DEFAULT NULL,
    `created_at` datetime NOT NULL,
    `updated_at` datetime NOT NULL,
    `status` varchar(65) NOT NULL COMMENT 'active, inactive, deleted',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- rollback drop table shop