/*EXERCÍCIO 1*/

SELECT T_FUNC.nr_matricula AS "MATRÍCULA",
       nm_funcionario AS "FUNCIONÁRIO",
       nm_dependente AS "NOME DEPENDENTE",
       T_DEP.dt_nascimento AS "DATA NASCIMENTO DEPENDENTE"
FROM T_SIP_FUNCIONARIO T_FUNC, T_SIP_DEPENDENTE T_DEP
WHERE T_FUNC.nr_matricula = T_DEP.nr_matricula
ORDER BY "FUNCIONÁRIO" ASC, "NOME DEPENDENTE" ASC;

/*EXERCÍCIO 2*/

 SELECT nr_matricula AS "MATRÍCULA",
        nm_funcionario AS "FUNCIONÁRIO",
        nm_dependente AS "NOME DEPENDENTE",
        D.dt_nascimento AS "DATA NASCIMENTO DEPENDENTE"
FROM T_SIP_FUNCIONARIO F INNER JOIN T_SIP_DEPENDENTE D
     USING(nr_matricula)
ORDER BY "FUNCIONÁRIO" ASC, "NOME DEPENDENTE" ASC;