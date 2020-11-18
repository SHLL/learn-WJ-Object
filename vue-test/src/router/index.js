import Vue from 'vue'
import VueRouter from 'vue-router'
import AppIndex from "@/components/home/AppIndex";
import Login from "@/views/Login";
import Home from "@/components/Home"
import LibraryIndex from "@/components/library/LibraryIndex";


Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Default',
    component: Home,
    redirect: '/index',
    children:[
      {
        path: '/index',
        name: 'AppIndex',
        component: AppIndex,
        meta:{
          requireAuth: true
        }
      },
      {
        path: '/library',
        name: 'library',
        component: LibraryIndex,
        meta: {
          requireAuth: true
        }
      }
    ]

  },
  {
    path: '/login',
    name: 'Login',
    component: Login
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
