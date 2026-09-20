.class public final synthetic Lq80;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ly80;


# direct methods
.method public synthetic constructor <init>(Ly80;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lq80;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lq80;->x:Ly80;

    .line 8
    .line 9
    return-void
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public synthetic constructor <init>(Ly80;ILjava/lang/CharSequence;)V
    .locals 0

    .line 10
    const/4 p2, 0x0

    iput p2, p0, Lq80;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq80;->x:Ly80;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lq80;->w:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Lq80;->x:Ly80;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Ly80;->t0:Lf90;

    .line 10
    .line 11
    iget-object v0, p0, Lf90;->c:Lx91;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Lc90;

    .line 16
    .line 17
    invoke-direct {v0, v1}, Lc90;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lf90;->c:Lx91;

    .line 21
    .line 22
    :cond_0
    iget-object p0, p0, Lf90;->c:Lx91;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    iget-object p0, p0, Ly80;->t0:Lf90;

    .line 29
    .line 30
    iget-object v0, p0, Lf90;->c:Lx91;

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    new-instance v0, Lc90;

    .line 35
    .line 36
    invoke-direct {v0, v1}, Lc90;-><init>(I)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Lf90;->c:Lx91;

    .line 40
    .line 41
    :cond_1
    iget-object p0, p0, Lf90;->c:Lx91;

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
