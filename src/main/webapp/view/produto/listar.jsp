<%@include file="../includes/header.jsp"%>

<h2>Listar produto</h2>
<div class="col s12 m4">
	<table>                
          <tr>
             <th>Nome</th>
             <th>Descrição</th>
          </tr>

          <c:forEach items = "${produtos}" var="produto">
          <tr>
             <td>${produto.nome}</td>
             <td>${produto.descricao}</td>
          </tr>
          </c:forEach>

       </table>
</div>

<%@include file="../includes/footer.jsp"%>
