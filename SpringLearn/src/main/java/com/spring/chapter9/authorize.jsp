<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<div>
	<h2>Sign in to Spitter</h2>

	<p>If you've been using Spitter from your phone, then that's
		amazing... we don't support IM yet.</p>

	<spring:url var="authUrl" value="/static/j_spring_security_check" />
	<security:authentication property="principal.username" var="loginId" scope="request"/>
	
	<sec:authorize access="hasRole('ROLE_SPITTER')">
		<s:url value="/spittles" var="spittle_url"/>
			<sf:form modelAttribute="spittle"
				action="${spittle_url }">
				<sf:label path="text"><s:message code="label.spittle"
					text="Enter spitter:"/></sf:label>
				<sf:textarea path="text" rows="2" cols="40"/>
					<sf:errors path="text"/>
				<br/>
				<div class="spitItSubmitIt">
					<input type="submit" value="Spit it!"
						class="status-btn round-btn disabled"/>
				</div>
				</sf:form>
				</sec:authorize>

	<security:authorize access="isAuthenticated() and principal.username=='habuma'">
		<a href="/admin">Administration</a>
	</security:authorize>
	
	<security:authorize url="/admin/**">
		<spring:url value="/admin" var="admin_url"/>
		<br/><a href="${admin_url}"/>
	</security:authorize>
</div>