<%@include file="../includes/header.jsp"%>

<h2>Visualizar produto</h2>
<div class="col s12 m4">
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
</div>

<%@include file="../includes/footer.jsp"%>
