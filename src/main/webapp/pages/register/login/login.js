var app, viewModel;

viewModel = {
	logindt: new u.DataTable({
		meta: {
			email: {
				type: 'string',
				required: true
			},
			password: {}
		}
	}),
	loginClick: function() {
		app.serverEvent().addDataTable("logindt").fire({
				ctrl: 'iweb.DemoController',
				method: 'method1',
				success: function(data) {

				},
				error: function() {}
			})
			// 模拟页面跳转，请将此代码写到fire的回调中
		document.location.href = '#'
			// document.location.href = '../../blanknav/index.html'
	}
};

app = u.createApp({
	el: 'body',
	model: viewModel
});

var r = viewModel.logindt.createEmptyRow();
viewModel.logindt.setRowSelect(0);

window.viewModel = viewModel