<%@include file="../includes/header.jsp"%>

<h2>Listar produto</h2>
<div class="col s12 m8">
	<table class="striped">
	 	<thead>                
          <tr>
             <th>Nome</th>
             <th>Descrição</th>
          </tr>
		</thead>
		<tbody>
          <c:forEach items = "${produtos}" var="produto">
          <tr>
             <td><a  href="${contextPath}/produto/visualizar/${produto.id}">${produto.nome}</a></td>
             <td>${produto.descricao}</td>
          </tr>
          </c:forEach>
		</tbody>
       </table>
       <div style="margin-top: 30px;">
	    <f:form style="float: right; margin-right: 20px" class="form-horizontal" role="form" action="${contextPath}/produto/cadastrar" method="GET" >
			<button type="submit" class="btn btn-primary">Cadastrar<i class="material-icons left">add</i></button>
		</f:form>
    </div>
</div>

<%@include file="../includes/footer.jsp"%>
