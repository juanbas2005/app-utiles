.class public final Lom0;
.super Landroid/telephony/TelephonyCallback;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Landroid/telephony/TelephonyCallback$SignalStrengthsListener;
.implements Landroid/telephony/TelephonyCallback$CellInfoListener;


# instance fields
.field public final synthetic a:Lop5;

.field public final synthetic b:Landroid/telephony/TelephonyManager;

.field public final synthetic c:Lpm0;


# direct methods
.method public constructor <init>(Lop5;Landroid/telephony/TelephonyManager;Lpm0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lom0;->a:Lop5;

    .line 2
    .line 3
    iput-object p2, p0, Lom0;->b:Landroid/telephony/TelephonyManager;

    .line 4
    .line 5
    iput-object p3, p0, Lom0;->c:Lpm0;

    .line 6
    .line 7
    invoke-direct {p0}, Landroid/telephony/TelephonyCallback;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
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
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
.end method


# virtual methods
.method public final onCellInfoChanged(Ljava/util/List;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/16 v1, 0x8

    .line 6
    .line 7
    iget-object v2, p0, Lom0;->b:Landroid/telephony/TelephonyManager;

    .line 8
    .line 9
    iget-object v3, p0, Lom0;->c:Lpm0;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, p1, v1}, Ln0;->v(Landroid/telephony/TelephonyManager;Lpm0;Landroid/telephony/SignalStrength;Ljava/util/List;I)Lqm0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object p0, p0, Lom0;->a:Lop5;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lop5;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    return-void
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

.method public final onSignalStrengthsChanged(Landroid/telephony/SignalStrength;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/16 v1, 0x10

    .line 6
    .line 7
    iget-object v2, p0, Lom0;->b:Landroid/telephony/TelephonyManager;

    .line 8
    .line 9
    iget-object v3, p0, Lom0;->c:Lpm0;

    .line 10
    .line 11
    invoke-static {v2, v3, p1, v0, v1}, Ln0;->v(Landroid/telephony/TelephonyManager;Lpm0;Landroid/telephony/SignalStrength;Ljava/util/List;I)Lqm0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object p0, p0, Lom0;->a:Lop5;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lop5;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    return-void
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
