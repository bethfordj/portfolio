import Vue from 'vue'
import Router from 'vue-router'
import Home from './views/Home.vue';
import WhatWeDo from '@/views/WhatWeDo';
import WhoWeAre from '@/views/WhoWeAre';
import EventsAdoption from '@/views/EventsAdoption';

Vue.use(Router)

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home
    },
    {
      path: '/what-we-do',
      name: 'whatWeDo',
      component: WhatWeDo
    },
    {
      path: '/who-we-are',
      name: 'whoWeAre',
      component: WhoWeAre
    },
    {
      path: '/events-adoption',
      name: 'eventsAdoption',
      component: EventsAdoption
    }
  ]
})
