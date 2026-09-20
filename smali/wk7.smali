.class public abstract Lwk7;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Ldf4;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Lqc8;->z:Lec8;

    .line 2
    .line 3
    sget-object v1, Lqc8;->y:Lqc8;

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    new-instance v3, Ldf4;

    .line 12
    .line 13
    invoke-direct {v3, v0, v1, v2}, Ldf4;-><init>(Lqc8;Lqc8;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    sput-object v3, Lwk7;->a:Ldf4;

    .line 17
    .line 18
    return-void
    .line 19
    .line 20
    .line 21
.end method
