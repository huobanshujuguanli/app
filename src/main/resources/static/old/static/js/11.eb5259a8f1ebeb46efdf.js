webpackJsonp([11],{"W/0o":function(e,i,t){"use strict";Object.defineProperty(i,"__esModule",{value:!0});var o=t("IcnI"),n=document.body;i.default={watch:{$route:function(e){"mobile"===this.device&&this.sidebar.opened&&o.a.dispatch("closeSideBar",{withoutAnimation:!1})}},beforeMount:function(){window.addEventListener("resize",this.resizeHandler)},mounted:function(){this.isMobile()&&(o.a.dispatch("toggleDevice","mobile"),o.a.dispatch("closeSideBar",{withoutAnimation:!0}))},methods:{isMobile:function(){return n.getBoundingClientRect().width-3<1024},resizeHandler:function(){if(!document.hidden){var e=this.isMobile();o.a.dispatch("toggleDevice",e?"mobile":"desktop"),e&&o.a.dispatch("closeSideBar",{withoutAnimation:!0})}}}}}});
//# sourceMappingURL=11.eb5259a8f1ebeb46efdf.js.map