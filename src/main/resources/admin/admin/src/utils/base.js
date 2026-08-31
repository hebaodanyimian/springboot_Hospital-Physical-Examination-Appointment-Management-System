const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootc4t380pd/",
            name: "springbootc4t380pd",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootc4t380pd/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于Java的医院体检预约管理系统 设计与实现"
        } 
    }
}
export default base
