var app, viewModel;
viewModel = {
	regdt: new u.DataTable({
		meta: {
			email: {
				type: 'string',
				required: true
			},
			password:  {
				type: 'string',
				required: true
			},
			// 加入新字段 gender: {},
			acceptAgree: {}
		}
	}),
	registerClick: function() {

		app.serverEvent().addDataTable("regdt").fire({
				ctrl: 'iweb.DemoController',
				method: 'method1',
				success: function(data) {

				},
				error: function() {}
			})
			// 模拟页面跳转，请将此代码写到fire的回调中
		document.location.href = '../login/login.html'
	}
};

app = u.createApp({
	el: 'body',
	model: viewModel
});

var r = viewModel.regdt.createEmptyRow();
viewModel.regdt.setRowSelect(0);