SELECT * FROM tradb.order_det;



CREATE sequence orderSeq (order_id INT NOT NULL);

CREATE TABLE sequence (id INT NOT NULL);

select sequence.NEXTVAL from orderSeq ;

CREATE TABLE sequence1 (id INT NOT NULL);
INSERT INTO sequence1 VALUES (0);
UPDATE sequence1 SET id=LAST_INSERT_ID(id+1);

SET SQL_SAFE_UPDATES=0;

SELECT LAST_INSERT_ID();


CREATE TABLE order_seq_gen (id INT NOT NULL , order_current_value INT NOT NULL );
INSERT INTO sequence1 VALUES (0,100);

select * from order_seq_gen;

delete from order_seq_gen;










