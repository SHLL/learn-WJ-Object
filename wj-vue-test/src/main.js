import Vue from 'vue'
import App from './App.vue'
import './registerServiceWorker'
import router from './router'
import store from './store'

var axios = require('axios')
axios.default.baseURL = 'http://localhost:8443/api'
Vue.prototype.$axios = axios
Vue.config.productionTip = false

new Vue({
  el:'#app',
  router,
  store,
  components:{App},
  template:'<App/>'
})
