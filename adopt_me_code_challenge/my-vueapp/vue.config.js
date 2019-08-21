module.exports = {
    css: {
        loaderOptions: {
            sass: {
                data: '@import "@/assets/scss/_variables.scss";'
            }
        }
    }, publicPath: process.env.NODE_ENV === 'production'
        ? '/adopt_me_code_challenge/try/'
        : '/'
};
