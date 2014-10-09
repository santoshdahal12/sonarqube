define ['third-party/jquery.mockjax'], ->

  jQuery.mockjaxSettings.contentType = 'text/json';
  jQuery.mockjaxSettings.responseTime = 250;

  # GET /api/codingrules/app
  jQuery.mockjax
    url: "#{baseUrl}/api/analysis_reports/search"
    responseText: JSON.stringify
      paging:
        pageIndex: 1
        pageSize: 3
        total: 3
        pages: 1
      reports: [
        {
          id: 82
          project: "org.codehaus.sonar:sonar"
          projectName: "SonarQube"
          startDate: "2014-10-09T11:11:11+02:00"
          status: "WORKING"
        }
        {
          id: 83
          project: "org.codehaus.sonar-plugins.visualstudio:sonar-visual-studio-plugin"
          projectName: "Analysis Bootstrapper for Visual Studio Projects"
          startDate: "2014-10-09T11:13:11+02:00"
          status: "PENDING"
        }
        {
          id: 84
          project: "org.codehaus.sonar:sonar"
          projectName: "SonarQube"
          startDate: "2014-10-09T11:14:11+02:00"
          status: "PENDING"
        }
      ]
