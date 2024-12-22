<%@ include file="/init.jsp" %>
<%
	List<Employee> employees = (List<Employee>) request.getAttribute("employees");
%>

<div class="search-bar">
	<input
		type="text"
		id="employeeSearch"
		placeholder="Search employees by name"
		class="search-input"
	/>
</div>

<div class="employee-cards" id="employeeCards">
	<% for (Employee employee : employees) { %>
		<div class="employee-card" data-name="<%= employee.getEmployeeName() %>">
			<h3 class="employee-name"><%= employee.getEmployeeName() %></h3>
			<p>Department: <span class="employee-detail"><%= employee.getDepartmentName() %></span></p>
			<p>Position: <span class="employee-detail"><%= employee.getPositionName() %></span></p>
			<p>Email: <span class="employee-detail"><%= employee.getEmail() %></span></p>
		</div>
	<% } %>
</div>

<style>
	/* General Styling */
	body {
		font-family: Arial, sans-serif;
		background-color: #f9f9f9;
		margin: 0;
		padding: 0;
	}

	.search-bar {
		margin: 20px auto;
		text-align: center;
	}

	.search-input {
		width: 50%;
		padding: 12px 20px;
		font-size: 16px;
		border: 1px solid #ccc;
		border-radius: 25px;
		box-shadow: 0px 4px 6px rgba(0, 0, 0, 0.1);
		outline: none;
		transition: all 0.3s ease-in-out;
	}

	.search-input:focus {
		border-color: #007bff;
		box-shadow: 0px 4px 6px rgba(0, 123, 255, 0.3);
	}

	/* Cards Container */
	.employee-cards {
		display: grid;
		grid-template-columns: repeat(3, 1fr);
		gap: 20px;
		padding: 20px;
	}

	/* Individual Card */
	.employee-card {
		background-color: #ffffff;
		border: 1px solid #ddd;
		border-radius: 10px;
		padding: 20px;
		box-shadow: 0px 6px 10px rgba(0, 0, 0, 0.1);
		transition: transform 0.2s, box-shadow 0.2s;
	}

	.employee-card:hover {
		transform: translateY(-5px);
		box-shadow: 0px 8px 15px rgba(0, 0, 0, 0.2);
	}

	.employee-name {
		margin: 0;
		font-size: 20px;
		color: #333;
	}

	.employee-detail {
		font-weight: bold;
		color: #555;
	}

	/* Color Enhancements */
	.employee-card:nth-child(odd) {
		background-color: #f7faff;
	}

	.employee-card:nth-child(even) {
		background-color: #ffffff;
	}

	/* Responsive Design */
	@media (max-width: 768px) {
		.employee-cards {
			grid-template-columns: repeat(2, 1fr);
		}
	}

	@media (max-width: 480px) {
		.employee-cards {
			grid-template-columns: 1fr;
		}

		.search-input {
			width: 90%;
		}
	}
</style>

<script>
	document.getElementById('employeeSearch').addEventListener('input', function () {
		const searchValue = this.value.toLowerCase();
		const cards = document.querySelectorAll('.employee-card');

		cards.forEach(card => {
			const name = card.getAttribute('data-name').toLowerCase();
			if (name.includes(searchValue)) {
				card.style.display = '';
			} else {
				card.style.display = 'none';
			}
		});
	});
</script>