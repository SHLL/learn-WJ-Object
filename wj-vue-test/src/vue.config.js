module.exports = {
    publicPath: '/',
    devServer: {
        port: 8080, // 源地址端口，自行修改
        proxy: {
            '/api': {
                target: 'http://localhost:8443',  // 跨域目标主机，自行修改
                changeOrigin: true,
                pathRewrite: {
                    '^/api': ''  // 重写地址
                }
            },
        }
    }
};

