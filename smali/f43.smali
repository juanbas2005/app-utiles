.class public final Lf43;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lx53;


# instance fields
.field public final w:Li53;

.field public final x:Lio/ktor/http/Url;

.field public final y:Liz0;

.field public final z:Lgz2;


# direct methods
.method public constructor <init>(Ly53;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Ly53;->b:Li53;

    .line 5
    .line 6
    iput-object v0, p0, Lf43;->w:Li53;

    .line 7
    .line 8
    iget-object v0, p1, Ly53;->a:Lyr7;

    .line 9
    .line 10
    invoke-virtual {v0}, Lyr7;->b()Lio/ktor/http/Url;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lf43;->x:Lio/ktor/http/Url;

    .line 15
    .line 16
    iget-object v0, p1, Ly53;->f:Liz0;

    .line 17
    .line 18
    iput-object v0, p0, Lf43;->y:Liz0;

    .line 19
    .line 20
    iget-object p1, p1, Ly53;->c:Ldz2;

    .line 21
    .line 22
    invoke-virtual {p1}, Ldz2;->d1()Lgz2;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lf43;->z:Lgz2;

    .line 27
    .line 28
    return-void
    .line 29
.end method


# virtual methods
.method public final D()Lio/ktor/http/Url;
    .locals 0

    .line 1
    iget-object p0, p0, Lf43;->x:Lio/ktor/http/Url;

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

.method public final V()Ll43;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "Call is not initialized"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
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

.method public final a()Lcz2;
    .locals 0

    .line 1
    iget-object p0, p0, Lf43;->z:Lgz2;

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

.method public final getAttributes()Liz0;
    .locals 0

    .line 1
    iget-object p0, p0, Lf43;->y:Liz0;

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

.method public final getMethod()Li53;
    .locals 0

    .line 1
    iget-object p0, p0, Lf43;->w:Li53;

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
