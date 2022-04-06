
SELECT nome,salario FROM pessoa p INNER JOIN salario s ON p.id_pessoa = s.id_pessoa
WHERE p.cpf = '123.123.123-12' AND s.data_inicio_vigencia < TO_DATE('2018-06-01','YYYY-MM-DD')  
AND (s.data_fim_vigencia > TO_DATE('2018-06-01','YYYY-MM-DD') OR s.data_fim_vigencia IS NULL)