import Vue from 'vue'
import Router from 'vue-router'
import User from "@/views/User"
import Users from "@/views/Users"

Vue.use(Router)

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [{
      path: '/',
      redirect: {
        name: 'users'
      }
    },
    {
      path: '/users',
      name: 'users',
      component: Users
    },
    {
      path: '/users/:userId',
      name: 'user',
      component: User
    }
  ]
})