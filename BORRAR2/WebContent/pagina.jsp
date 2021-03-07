<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>    
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Ejemplo JSF 2</h2>

	<f:view>

		<h:form id="formulario">
		
			<h:panelGrid columns="3">
							
					<h:outputLabel for="nombre" value="Nombre"/>
					<h:inputText id="nombre" value="#{cliente.nombre}">
						
					</h:inputText>
					<h:message for="nombre"/>
						
					<h:outputLabel for="direccion" value="Dirección"/>
					<h:inputText id="direccion" value="#{cliente.direccion}">
					</h:inputText>
					<h:message for="direccion"/>
					
					<h:outputLabel for="telefono" value="Teléfono"/>
					<h:inputText id="telefono" value="#{cliente.telefono}">
					</h:inputText>
					<h:message for="telefono"/>
					
			</h:panelGrid>
		
			<h:panelGroup>
				<h:commandButton value="Insertar" action="#{clientesBB.insertarCliente}"/>
			</h:panelGroup>
		
		</h:form>

	</f:view>

</body>
</html>