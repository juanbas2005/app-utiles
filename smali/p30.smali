.class public final Lp30;
.super Lr58;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final b:Ljava/lang/String;

.field public c:Luy5;


# direct methods
.method public constructor <init>(Lye6;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lr58;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "SaveableStateHolder_BackStackEntryKey"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Lye6;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Ljava/lang/String;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {p1, v0, v1}, Lye6;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iput-object v1, p0, Lp30;->b:Ljava/lang/String;

    .line 26
    .line 27
    return-void
    .line 28
    .line 29
.end method


# virtual methods
.method public final d()V
    .locals 4

    .line 1
    iget-object v0, p0, Lp30;->c:Luy5;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "saveableStateHolderRef"

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    iget-object v0, v0, Luy5;->x:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Loe6;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v3, p0, Lp30;->b:Ljava/lang/String;

    .line 21
    .line 22
    invoke-interface {v0, v3}, Loe6;->f(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object p0, p0, Lp30;->c:Luy5;

    .line 26
    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    iget-object p0, p0, Luy5;->x:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, Ljava/lang/ref/WeakReference;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->clear()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    invoke-static {v2}, Lsg3;->a0(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v1

    .line 41
    :cond_2
    invoke-static {v2}, Lsg3;->a0(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v1
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
