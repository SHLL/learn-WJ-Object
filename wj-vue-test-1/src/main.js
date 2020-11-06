import Vue from 'vue'
import App from './App.vue'
import './registerServiceWorker'
import router from './router'
import store from './store'

//载入iView组件
import iView from "iview";
import 'iview/dist/styles/iview.css'
Vue.use(iView);
//载入easy
import 'vue-easytable/libs/themes-base/index.css'
import {VTable,VPagination} from 'vue-easytable'
Vue.component(VTable.name,VTable)
Vue.component(VPagination.name,VPagination)


Vue.config.productionTip = false

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
