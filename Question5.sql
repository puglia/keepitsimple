select p.nome,(salario + sum(b.valor_beneficio)) as remuneracao 
from PESSOA p inner join BENEFICIO b on b.cd_pessoa = p.cd_pessoa
group by p.cd_pessoa