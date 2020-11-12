import Vue from 'vue'
import VueRouter from 'vue-router'
import AppIndex from "@/views/AppIndex";
import Login from "@/views/Login";
import About from "@/views/About"


Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Login',
    component: Login
  },
  {
    path: '/about',
    name: 'About',
    component: About
  },
  {
    path: '/index',
    name: 'AppIndex',
    component: AppIndex,
    meta:{
      requireAuth: true
    }
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
