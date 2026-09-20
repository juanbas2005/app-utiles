.class public interface abstract Lse0;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lue0;


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    invoke-interface {p0}, Lse0;->d()Lf61;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    new-instance v0, Lm66;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Lm66;-><init>(Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget-object p1, Lue0;->a:Lxb4;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    sget-object v0, Lvs7;->a:Lvs7;

    .line 19
    .line 20
    :goto_0
    invoke-interface {p0, v0}, Lf61;->f(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public b()V
    .locals 1

    .line 1
    invoke-interface {p0}, Lse0;->d()Lf61;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lue0;->a:Lxb4;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v0, Lvs7;->a:Lvs7;

    .line 11
    .line 12
    invoke-interface {p0, v0}, Lf61;->f(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public abstract c()Ljava/lang/Throwable;
.end method

.method public abstract d()Lf61;
.end method
