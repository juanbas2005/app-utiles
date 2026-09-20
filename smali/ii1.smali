.class public abstract Lii1;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lni1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Lki1;->b:Lkw5;

    .line 2
    .line 3
    new-instance v1, Lf81;

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lf81;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v0, Lmi1;

    .line 14
    .line 15
    new-instance v2, Lns8;

    .line 16
    .line 17
    const/4 v3, 0x4

    .line 18
    invoke-direct {v2, v3}, Lns8;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v2}, Lmi1;-><init>(Lns8;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v0}, Lf81;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    new-instance v1, Lni1;

    .line 28
    .line 29
    invoke-interface {v0}, Le1;->build()Llh0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-direct {v1, v0, v2}, Lni1;-><init>(Llh0;I)V

    .line 35
    .line 36
    .line 37
    sput-object v1, Lii1;->a:Lni1;

    .line 38
    .line 39
    new-instance v0, Lf81;

    .line 40
    .line 41
    const/16 v1, 0xe

    .line 42
    .line 43
    invoke-direct {v0, v1}, Lf81;-><init>(I)V

    .line 44
    .line 45
    .line 46
    new-instance v1, Lmi1;

    .line 47
    .line 48
    new-instance v2, Lns8;

    .line 49
    .line 50
    invoke-direct {v2, v3}, Lns8;-><init>(I)V

    .line 51
    .line 52
    .line 53
    invoke-direct {v1, v2}, Lmi1;-><init>(Lns8;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Lf81;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    invoke-interface {v1}, Le1;->build()Llh0;

    .line 60
    .line 61
    .line 62
    return-void
    .line 63
.end method
