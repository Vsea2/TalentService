const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot1psu9o74/",
            name: "springboot1psu9o74",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot1psu9o74/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "智慧社区服务平台"
        } 
    }
}
export default base
