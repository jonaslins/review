<%@include file="../includes/header.jsp"%>

<h2>Visualizar produto</h2>
<div class="col s12 m8">
    <table class="striped">
    	<tbody>
	        <tr>
	            <td>ID :</td>
	            <td>${produto.id}</td>
	        </tr>
	        <tr>
	            <td>Nome :</td>
	            <td>${produto.nome}</td>
	        </tr>
	        <tr>
	            <td>Descrição :</td>
	            <td>${produto.descricao}</td>
	        </tr>
        </tbody>
    </table>
    <div style="margin-top: 30px;">
        <f:form modelAttribute="produto" style="float: right" class="form-horizontal" role="form" action="${contextPath}/produto/atualizar/${produto.id}" method="POST" >
		<button type="submit" class="btn btn-primary">Atualizar<i class="material-icons left">edit</i></button>
		</f:form>
	    <f:form modelAttribute="produto" style="float: right; margin-right: 20px" class="form-horizontal" role="form" action="${contextPath}/produto/remover/${produto.id}" method="POST" >
			<button type="submit" class="btn btn-primary">Remover<i class="material-icons left">delete</i></button>
		</f:form>
    </div>
    
    

	
</div>


<%@include file="../includes/footer.jsp"%>
