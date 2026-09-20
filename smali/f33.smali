.class public final Lf33;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ltu6;


# instance fields
.field public final w:Ltp2;

.field public x:Z

.field public final synthetic y:Lh33;


# direct methods
.method public constructor <init>(Lh33;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf33;->y:Lh33;

    .line 5
    .line 6
    new-instance v0, Ltp2;

    .line 7
    .line 8
    iget-object p1, p1, Lh33;->c:Lwr0;

    .line 9
    .line 10
    iget-object p1, p1, Lwr0;->z:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Lyw5;

    .line 13
    .line 14
    iget-object p1, p1, Lyw5;->w:Ltu6;

    .line 15
    .line 16
    invoke-interface {p1}, Ltu6;->g()Lri7;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {v0, p1}, Ltp2;-><init>(Lri7;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lf33;->w:Ltp2;

    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lf33;->x:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lf33;->x:Z

    .line 8
    .line 9
    iget-object v0, p0, Lf33;->w:Ltp2;

    .line 10
    .line 11
    iget-object v1, v0, Ltp2;->e:Lri7;

    .line 12
    .line 13
    sget-object v2, Lri7;->d:Lqi7;

    .line 14
    .line 15
    iput-object v2, v0, Ltp2;->e:Lri7;

    .line 16
    .line 17
    invoke-virtual {v1}, Lri7;->a()Lri7;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Lri7;->b()Lri7;

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x3

    .line 24
    iget-object p0, p0, Lf33;->y:Lh33;

    .line 25
    .line 26
    iput v0, p0, Lh33;->d:I

    .line 27
    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public final flush()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lf33;->x:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object p0, p0, Lf33;->y:Lh33;

    .line 7
    .line 8
    iget-object p0, p0, Lh33;->c:Lwr0;

    .line 9
    .line 10
    iget-object p0, p0, Lwr0;->z:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lyw5;

    .line 13
    .line 14
    invoke-virtual {p0}, Lyw5;->flush()V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final g()Lri7;
    .locals 0

    .line 1
    iget-object p0, p0, Lf33;->w:Ltp2;

    .line 2
    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final g0(JLsc0;)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lf33;->x:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-wide v1, p3, Lsc0;->x:J

    .line 6
    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    move-wide v5, p1

    .line 10
    invoke-static/range {v1 .. v6}, Ldg8;->a(JJJ)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lf33;->y:Lh33;

    .line 14
    .line 15
    iget-object p0, p0, Lh33;->c:Lwr0;

    .line 16
    .line 17
    iget-object p0, p0, Lwr0;->z:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Lyw5;

    .line 20
    .line 21
    invoke-virtual {p0, v5, v6, p3}, Lyw5;->g0(JLsc0;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const-string p0, "closed"

    .line 26
    .line 27
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method
