<%@include file="../includes/header.jsp"%>


<f:form modelAttribute="produto" class="form-horizontal" role="form" action="${contextPath}/produto/cadastrar" method="POST">


				<h2 class="header">Cadastrar Produto</h2>
				<div class="col s12 m4">
					<div class="form-group">
						<f:label path="nome" class="col-lg-2 control-label">Nome</f:label>
						<div class="col-lg-10">
							<f:input path="nome" class="form-control" placeholder="Nome" />
							<f:errors cssClass="error" path="nome" />
						</div>
						
						<f:label path="descricao" class="col-lg-2 control-label">Descrição</f:label>
						<div class="col-lg-10">
							<f:input path="descricao" class="form-control" placeholder="Descrição" />
							<f:errors cssClass="error" path="descricao" />
						</div>
					</div>

					<div class="form-group">
						<div class="col-lg-offset-2 col-lg-10">
							<button type="submit" class="btn btn-primary">Cadastrar</button>
						</div>
					</div>
				</div>
			



</f:form>

<%@include file="../includes/footer.jsp"%>
