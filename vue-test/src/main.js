import Vue from 'vue'
import './plugins/axios'
import App from './App.vue'
import './registerServiceWorker'
import router from './router'
import store from './store'
import './plugins/element.js'
//先 vue add  axios  或者到vue ui 中加载插件
//vue-cli3.x 增加axios的方式
import axios from 'axios'
axios.defaults.baseURL = 'http://localhost:8181/api'


Vue.config.productionTip = false

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')

router.beforeEach((to, from, next) =>{
  if(to.meta.requireAuth) {
    if (store.state.user.username){
      next()
    }else{
      next({
        path: 'login',
        query: {redirect: to.fullPath}
      })
    }
  } else{
    next()
  }
})
