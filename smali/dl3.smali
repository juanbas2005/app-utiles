.class public abstract Ldl3;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# static fields
.field public static final a:Lo96;

.field public static final b:F

.field public static final c:F

.field public static final d:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/high16 v0, 0x41d00000    # 26.0f

    .line 2
    .line 3
    invoke-static {v0}, Lq96;->a(F)Lo96;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Ldl3;->a:Lo96;

    .line 8
    .line 9
    const/high16 v0, 0x41200000    # 10.0f

    .line 10
    .line 11
    sput v0, Ldl3;->b:F

    .line 12
    .line 13
    const/high16 v0, 0x42780000    # 62.0f

    .line 14
    .line 15
    sput v0, Ldl3;->c:F

    .line 16
    .line 17
    const/high16 v0, 0x42200000    # 40.0f

    .line 18
    .line 19
    sput v0, Ldl3;->d:F

    .line 20
    .line 21
    return-void
.end method
