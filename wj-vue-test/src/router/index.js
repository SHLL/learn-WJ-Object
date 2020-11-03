import Vue from 'vue'
import VueRouter from 'vue-router'

import AppIndex from "@/components/home/AppIndex";
import Login from "@/components/Login";

Vue.use(VueRouter)

export default new VueRouter ({
  routes: [
    {
      path: '/',
      redirect: '/login'
    },
    {
      path: '/login',
      name: 'Login',
      component: Login
    },
    {
      path: '/index',
      name: 'AppIndex',
      component: AppIndex
    }
  ]
})


